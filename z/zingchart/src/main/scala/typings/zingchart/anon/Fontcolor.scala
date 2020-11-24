package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fontcolor extends js.Object {
  
  /**
    * To specify the font color of the context menu items. 'gray' | '##666699'
    */
  var `font-color`: js.UndefOr[js.Any] = js.native
  
  /**
    * To display or remove the Save Image context menu item. true | false
    */
  var image: js.UndefOr[Boolean] = js.native
  
  /**
    * To display or remove the Lock/Unlock Scrolling context menu item. true | false
    */
  var lock: js.UndefOr[Boolean] = js.native
  
  /**
    * Use the object to display or remove individual Share Image context menu items: email, facebook, twitter, and linkedin. {...}
    */
  var share: js.UndefOr[js.Any] = js.native
}
object Fontcolor {
  
  @scala.inline
  def apply(): Fontcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fontcolor]
  }
  
  @scala.inline
  implicit class FontcolorOps[Self <: Fontcolor] (val x: Self) extends AnyVal {
    
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
    def `setFont-color`(value: js.Any): Self = this.set("font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-color`: Self = this.set("font-color", js.undefined)
    
    @scala.inline
    def setImage(value: Boolean): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setShare(value: js.Any): Self = this.set("share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShare: Self = this.set("share", js.undefined)
  }
}
