package typings.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions
  extends StObject
     with AnchorOptions {
  
  /**
    * Updates the rendering order of the group’s child items.
    * @default false
    * @see {@link https://zzz.dog/api#group-updatesort Zdog API}
    */
  val updateSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows or hides group, including all child items in the group.
    * {@link Shape#visible} only shows or hides the item.
    * @default true
    * @see {@link https://zzz.dog/api#group-visible Zdog API}
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  extension [Self <: GroupOptions](x: Self) {
    
    inline def setUpdateSort(value: Boolean): Self = StObject.set(x, "updateSort", value.asInstanceOf[js.Any])
    
    inline def setUpdateSortUndefined: Self = StObject.set(x, "updateSort", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
