package model.marketPost;

import java.util.List;


public interface MarketPostService {
	List<MarketPostDTO> selectAll(MarketPostDTO marketPostDTO);
	MarketPostDTO selectOne(MarketPostDTO marketPostDTO);
	
	boolean insert(MarketPostDTO marketPostDTO);
	boolean update(MarketPostDTO marketPostDTO);
	boolean delete(MarketPostDTO marketPostDTO);
}
