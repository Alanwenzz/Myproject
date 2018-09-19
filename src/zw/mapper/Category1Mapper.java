package zw.mapper;


import zw.pojo1.Ccategory1;

public interface Category1Mapper {
	public int add(Ccategory1 category);  
    
    public void delete(int id);         
      
    public Ccategory1 get(int id);     
      
    public int update(Ccategory1 category);          
      

}
