#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end

import com.tny.game.common.enums.EnumID;

import com.tny.game.doc.annotation.ClassDoc;
import com.tny.game.doc.annotation.IDDoc;

@ClassDoc("${CLASS_DESC}")
public enum ${NAME} implements EnumID<Integer>{

    ;
    
    @IDDoc("${CLASS_DESC} ID")
    private Integer id;
    
    ${NAME}(Integer id) {
        this.id = id;
        ConfigerChecker.check(this.getClass(), id, "{}-[{}-ID:{}]发生重复", this.getClass(), this, id);
    }
    
    @Override
    public Integer getID(){
        return id;
    }

}