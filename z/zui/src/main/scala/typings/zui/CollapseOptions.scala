package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseOptions extends StObject {
  
  var parent: js.UndefOr[js.Any] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
}
object CollapseOptions {
  
  @scala.inline
  def apply(): CollapseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseOptions]
  }
  
  @scala.inline
  implicit class CollapseOptionsMutableBuilder[Self <: CollapseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
