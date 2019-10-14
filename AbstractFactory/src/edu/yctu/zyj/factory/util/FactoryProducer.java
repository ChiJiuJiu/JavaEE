package edu.yctu.zyj.factory.util;

import edu.yctu.zyj.factory.AbstractFactory;
import edu.yctu.zyj.factory.impl.ColorFactory;
import edu.yctu.zyj.factory.impl.ShapeFactory;

/**
 * ����������(���ɳ��󹤳�)
 * 
 * @author ���ˬB
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	   }
}
