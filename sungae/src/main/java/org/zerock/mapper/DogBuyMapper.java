package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.DogBuy2VO;
import org.zerock.domain.DogBuyVO;
import org.zerock.domain.DogInfoDTO;

public interface DogBuyMapper {

	public List<DogInfoDTO> dog1List();
	public List<DogBuyVO> dog2List();

	//2021.12.12 수정
	public Integer doginsert(DogBuyVO dogBuyVO);
	
	//2021.12.13 수정
	//public DogBuyVO doginsert1(Long dno);
	//resultType DogBuyVO 에러발생 해당  mapper 사용불가	
	
//	//2021.12.13 수정
//	public Long doginsert2(DogBuyVO dogBuyVO);
	
	//2021.12.13 수정
	public Long doginsert2();
	
	
	public Integer doginsert2(DogBuy2VO dog2BuyVO);
	

	public void insert(DogBuyVO dog1List);

	public DogBuyVO read(Long bno);

	public int delete(Long bno);

	public int update(DogBuyVO dog1List);
	
	
	//장바구니에 상품번호 있는지 확인 쿼리문
	public Long cartdno();

}
