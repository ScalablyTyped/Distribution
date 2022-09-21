package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontColor_ extends StObject {
  
  /**
    * To specify the font color of the context menu items. 'gray' | '##666699'
    */
  var `font-color`: js.UndefOr[Any] = js.undefined
  
  var fontColor: js.UndefOr[Any] = js.undefined
  
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
  var share: js.UndefOr[Any] = js.undefined
}
object FontColor_ {
  
  inline def apply(): FontColor_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontColor_]
  }
  
  extension [Self <: FontColor_](x: Self) {
    
    inline def `setFont-color`(value: Any): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def setFontColor(value: Any): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    inline def setShare(value: Any): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    inline def setShareUndefined: Self = StObject.set(x, "share", js.undefined)
  }
}
