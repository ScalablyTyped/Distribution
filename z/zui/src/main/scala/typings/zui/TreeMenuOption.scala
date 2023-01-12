package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMenuOption extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Array[TreeNode]] = js.undefined
  
  var initialState: js.UndefOr[String] = js.undefined
  
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, Any]] = js.undefined
  
  var itemWrapper: js.UndefOr[Boolean] = js.undefined
}
object TreeMenuOption {
  
  inline def apply(): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMenuOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeMenuOption] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setData(value: js.Array[TreeNode]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: TreeNode*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setItemCreator(value: (/* li */ JQuery | js.Object, /* item */ TreeNode) => Any): Self = StObject.set(x, "itemCreator", js.Any.fromFunction2(value))
    
    inline def setItemCreatorUndefined: Self = StObject.set(x, "itemCreator", js.undefined)
    
    inline def setItemWrapper(value: Boolean): Self = StObject.set(x, "itemWrapper", value.asInstanceOf[js.Any])
    
    inline def setItemWrapperUndefined: Self = StObject.set(x, "itemWrapper", js.undefined)
  }
}
