package org.zerock.service;

import java.util.List;

import org.zerock.domain.DogBuy2VO;
import org.zerock.domain.DogBuyVO;
import org.zerock.domain.DogInfoDTO;

public interface DogBuyService {
	
	
	//상세보기에서 장바구니 담기때 사용
	public Long dogregister(DogBuyVO dogBuyVO);
	
	//상세보기에서 장바구니 담기때 사용
	//public DogBuyVO dogregister(Long dno);
	//사용불가
	
	
	
	
	public void dogregister2(DogBuy2VO dog2BuyVO);

	public Long dogregister3(Long dno);
	
	public List<DogInfoDTO> dog1List();
	public List<DogBuyVO> dog2List();

	//장바구니에 담긴 상품 조회 2012.12.13 성애
	public Long cartdno();
	
	public DogBuyVO get(Long bno);

	public boolean modify(DogBuyVO dog1List);

	public boolean remove(Long dno);

}
