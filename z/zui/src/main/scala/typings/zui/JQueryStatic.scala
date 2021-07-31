package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var zui: ZuiStatic
}
object JQueryStatic {
  
  @scala.inline
  def apply(zui: ZuiStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(zui = zui.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZui(value: ZuiStatic): Self = StObject.set(x, "zui", value.asInstanceOf[js.Any])
  }
}
