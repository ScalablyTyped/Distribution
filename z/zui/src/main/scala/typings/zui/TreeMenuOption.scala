package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMenuOption extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Array[TreeNode]] = js.native
  
  var initialState: js.UndefOr[String] = js.native
  
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _]] = js.native
  
  var itemWrapper: js.UndefOr[Boolean] = js.native
}
object TreeMenuOption {
  
  @scala.inline
  def apply(): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMenuOption]
  }
  
  @scala.inline
  implicit class TreeMenuOptionMutableBuilder[Self <: TreeMenuOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[TreeNode]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: TreeNode*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setItemCreator(value: (/* li */ JQuery | js.Object, /* item */ TreeNode) => _): Self = StObject.set(x, "itemCreator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemCreatorUndefined: Self = StObject.set(x, "itemCreator", js.undefined)
    
    @scala.inline
    def setItemWrapper(value: Boolean): Self = StObject.set(x, "itemWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWrapperUndefined: Self = StObject.set(x, "itemWrapper", js.undefined)
  }
}
