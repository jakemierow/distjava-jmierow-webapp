package edu.wctc.servlet;

import edu.wctc.entity.Product;
import edu.wctc.entity.ProductDetail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SearchServlet2", urlPatterns = "/search2")
public class SearchServlet2 extends HttpServlet {
    private final String DRIVER_NAME = "jdbc:derby:";
    private final String DATABASE_PATH = "../../db";
    private final String SCHEMA = "jake";
    private final String PASSWORD = "jake";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            String searchTerm = request.getParameter("ProductName");

            // Load the driver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            // Find the absolute path of the database folder
            String absPath = getServletContext().getRealPath("/") + DATABASE_PATH;

            // Build the query as a String
            StringBuilder sql = new StringBuilder("select productID, ProductName ");
            sql.append("from products ");
            sql.append("join productdetails on (products.productid = productdetails.productid)");
            sql.append("where productName = ?"); // Don't end SQL with semicolon!

            // Create a connection
            conn = DriverManager.getConnection(DRIVER_NAME + absPath, SCHEMA, PASSWORD);
            // Create a statement to execute SQL
            pstmt = conn.prepareStatement(sql.toString());
            // Fill the prepared statement params
            pstmt.setString(1, searchTerm);
            // Execute a SELECT query and get a result set
            rset = pstmt.executeQuery();

            List<Product> ProductList = new ArrayList<Product>();

            // Loop while the result set has more rows
            while (rset.next()) {
                Product product = new Product();
                product.setProductID(rset.getInt(1));
                product.setProductName(rset.getString(2));

                ProductDetail detail = new ProductDetail();
                product.setDetail(detail);

                detail.setCategoryID(rset.getInt(3));
                detail.setPrice(rset.getInt(4));
                ProductList.add(product);
            }

            request.setAttribute("products", ProductList);
            request.getRequestDispatcher("search2.jsp").forward(request, response);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}


