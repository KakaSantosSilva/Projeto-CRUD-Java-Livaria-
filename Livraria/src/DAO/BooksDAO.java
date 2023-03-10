
package DAO;

import DTO.BookDTO;
import java.util.ArrayList;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class BooksDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<BookDTO> lista = new ArrayList<>();
    
    
public void Cadastrarlivros( BookDTO objBookdto){
     
     String sql = "insert into book(title,author,isbn,pages,price)values(?,?,?,?,?)";
     
     conn = new ConexaoDAO().ConectaBD();
     
     try {
          pstm = conn.prepareStatement(sql);
          pstm.setString(1, objBookdto.getTitle());
          pstm.setString(2, objBookdto.getAuthor());
          pstm.setString(3, objBookdto.getIsbn());
          pstm.setInt(4, objBookdto.getPages());
          pstm.setDouble(5, objBookdto.getPrice());

          pstm.execute();
          pstm.close();
     } catch (SQLException erro) {
         JOptionPane.showMessageDialog(null, "CADASTRARVIDEOGAME "+erro);
     }
 }
    public ArrayList<BookDTO>PesquisarBooks(){
        String sql = "Select * from book";
        
        conn = new ConexaoDAO().ConectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                 BookDTO objbookdto = new BookDTO();
                 objbookdto.setId_book(rs.getInt("id"));
                 objbookdto.setTitle(rs.getString("title"));
                 objbookdto.setAuthor(rs.getString("author"));
                 objbookdto.setIsbn(rs.getString("isbn"));
                 objbookdto.setPages(rs.getInt("pages"));
                 objbookdto.setPrice(rs.getDouble("price"));
                
                lista.add(objbookdto);
         
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Pesquisar Book"+erro);
        }
        return lista;
    }
      public void AlterarBook(BookDTO objAlterar ){
        
        String sql = "Update book set title= ?, author = ?, isbn = ?, pages = ?,price = ? where id = ? ";
        
         conn = new ConexaoDAO().ConectaBD();
         
            try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAlterar.getTitle());
            pstm.setString(2, objAlterar.getAuthor());
            pstm.setString(3, objAlterar.getIsbn());
            pstm.setInt(4, objAlterar.getPages());
            pstm.setDouble(5, objAlterar.getPrice());
            pstm.setInt(6, objAlterar.getId_book());
          
            pstm.execute();
            
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALTERAR BOOK "+erro);
        }
       
    }
    public void Excluirlivro(BookDTO objexcluir){
        String sql = "delete from book where id = ?";
        
         conn = new ConexaoDAO().ConectaBD();
            try {
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objexcluir.getId_book());
          
            pstm.execute();
            
            pstm.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EXCLUIR BOOK "+erro);
        }
 
    }
    
   
 
    
 
 
 
 
}
