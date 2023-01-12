package typings.zinggrid.ZSoft

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonoptionalAttributes extends StObject {
  
  /**
    * @description Enables the default "<zing-grid>" context menu or set to the id name of a custom "<zg-menu>".  If
    * set to a custom menu and "<zg-menu>" has the "replace" attribute present, then the custom menu will replace the context menu.
    * Otherwise the contents of the custom menu is appended to the end of context menu.
    */
  var contextMenu: String | Boolean
  
  /**
    * @description The HTML standard direction to indicate direction of grid's columns and text
    */
  var dir: String
  
  /**
    * @description Presence of attribute hides the column
    */
  var hidden: Boolean
  
  /**
    * @description Sets the language to use for the grid
    */
  var lang: String
}
object NonoptionalAttributes {
  
  inline def apply(contextMenu: String | Boolean, dir: String, hidden: Boolean, lang: String): NonoptionalAttributes = {
    val __obj = js.Dynamic.literal(contextMenu = contextMenu.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonoptionalAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonoptionalAttributes] (val x: Self) extends AnyVal {
    
    inline def setContextMenu(value: String | Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
