#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};
#end

import com.tny.game.base.item.behavior.Action;
import com.tny.game.common.enums.EnumID;

import com.tny.game.doc.annotation.ClassDoc;
import com.tny.game.doc.annotation.IDDoc;

@ClassDoc("${CLASS_DESC}")
public enum ${NAME} implements EnumID<Integer>{

    ;
    
    @IDDoc("${CLASS_DESC} ID")
    private Integer id;
    
    private Action action;
    
    ${NAME}(Integer id, Action action) {
        this.id = id;
        this.action = action;
    }
    
    @Override
    public Integer getID(){
        return id;
    }
    
    public Action getAction(){
        return action;
    }

}