/**
 *@Generated by QuickVO Tools 1.5 
 */
package org.sagacity.sqltoy.demo.vo;

import java.util.Date;
import java.util.List;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.demo.vo.base.AbstractDictTypeVO;

/**
 * @project sqltoy-orm
 * @author chenrenfei@lakala.com
 * @version 1.0.0
 * 数据字典分类表  		
 * DictTypeVO generated by TEST_DICT_TYPE
 */
@SqlToyEntity
public class DictTypeVO extends AbstractDictTypeVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
	public DictTypeVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public DictTypeVO(String dictTypeCode)
	{
		this.dictTypeCode=dictTypeCode;
	}

	/** minimal constructor */
	public DictTypeVO(String dictTypeCode,String dictTypeName,String appCode,Integer dataType,Integer enabled)
	{
		this.dictTypeCode=dictTypeCode;
		this.dictTypeName=dictTypeName;
		this.appCode=appCode;
		this.dataType=dataType;
		this.enabled=enabled;
	}

	/** full constructor */
	public DictTypeVO(String dictTypeCode,String dictTypeName,String dictTypeNameEn,String appCode,String comments,Integer dataSize,Integer dataType,String operator,Date operateDate,String segmentName,Integer segmentType,String segmentDictType,Integer enabled)
	{
		this.dictTypeCode=dictTypeCode;
		this.dictTypeName=dictTypeName;
		this.dictTypeNameEn=dictTypeNameEn;
		this.appCode=appCode;
		this.comments=comments;
		this.dataSize=dataSize;
		this.dataType=dataType;
		this.operator=operator;
		this.operateDate=operateDate;
		this.segmentName=segmentName;
		this.segmentType=segmentType;
		this.segmentDictType=segmentDictType;
		this.enabled=enabled;
	}

    /**
	 * mapping SAG_DICT_DETAIL data to SAG_DICT_TYPE oneToMany List
	 */
	public void mappingDictDetailVOs(List<DictTypeVO> mainSet,List<DictDetailVO> itemSet)
    {
    	if(mainSet==null || mainSet.isEmpty() || itemSet==null||itemSet.isEmpty())
    		return;
    	DictTypeVO main;
    	DictDetailVO item;
    	for(int i=0;i<mainSet.size();i++){
    		main=mainSet.get(i);
    		if(itemSet.size()==0)
    			break;
    		for(int j=0;j<itemSet.size();j++){
    			item=itemSet.get(j);
    			if(main.getDictTypeCode().equals(item.getDictTypeCode())){
    			   main.dictDetailVOs.add(item);
    			   itemSet.remove(j);
    			   j--;
    			}
    		}
    	}
    }
	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public DictTypeVO clone() {
		try {
			// TODO Auto-generated method stub
			return (DictTypeVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
