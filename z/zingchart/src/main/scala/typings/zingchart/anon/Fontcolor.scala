package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fontcolor extends StObject {
  
  /**
    * To specify the font color of the context menu items. 'gray' | '##666699'
    */
  var `font-color`: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To display or remove the Save Image context menu item. true | false
    */
  var image: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To display or remove the Lock/Unlock Scrolling context menu item. true | false
    */
  var lock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use the object to display or remove individual Share Image context menu items: email, facebook, twitter, and linkedin. {...}
    */
  var share: js.UndefOr[js.Any] = js.undefined
}
object Fontcolor {
  
  @scala.inline
  def apply(): Fontcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fontcolor]
  }
  
  @scala.inline
  implicit class FontcolorMutableBuilder[Self <: Fontcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFont-color`(value: js.Any): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    @scala.inline
    def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    @scala.inline
    def setShare(value: js.Any): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareUndefined: Self = StObject.set(x, "share", js.undefined)
  }
}
