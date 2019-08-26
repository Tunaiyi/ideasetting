#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end

import com.tny.game.common.enums.EnumID;

public enum ${NAME} implements EnumID<${ID_TYPE}>{

    ;
    
    private ${ID_TYPE} id;
    
    ${NAME}(${ID_TYPE} id) {
        this.id = id;
        ConfigerChecker.check(this.getClass(), id, "{}-[{}-ID:{}]发生重复", this.getClass(), this, id);
    }
    
    @Override
    public ${ID_TYPE} getID(){
        return id;
    }

}