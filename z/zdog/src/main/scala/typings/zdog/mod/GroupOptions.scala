package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOptions extends AnchorOptions {
  
  /**
    * Updates the rendering order of the group’s child items.
    * @default false
    * @see {@link https://zzz.dog/api#group-updatesort Zdog API}
    */
  val updateSort: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows or hides group, including all child items in the group.
    * {@link Shape#visible} only shows or hides the item.
    * @default true
    * @see {@link https://zzz.dog/api#group-visible Zdog API}
    */
  val visible: js.UndefOr[Boolean] = js.native
}
object GroupOptions {
  
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUpdateSort(value: Boolean): Self = this.set("updateSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSort: Self = this.set("updateSort", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
