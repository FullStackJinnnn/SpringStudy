package model.freePost;

import java.util.List;

public interface FreePostService{
	List<FreePostDTO> selectAll(FreePostDTO freePostDTO);
	FreePostDTO selectOne(FreePostDTO freePostDTO);
	
	boolean insert(FreePostDTO freePostDTO);
	boolean update(FreePostDTO freePostDTO);
	boolean delete(FreePostDTO freePostDTO);
}
