package io.spring2go.corespring.singleton_v2;

// ÑÓ³Ù³õÊ¼»¯µ¥Àý
public class LazySingleton {
    private static LazySingleton INSTANCE;
    
    private LazySingleton(){}
    
    public static LazySingleton getInstance(){
        if(INSTANCE == null){
        	INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
