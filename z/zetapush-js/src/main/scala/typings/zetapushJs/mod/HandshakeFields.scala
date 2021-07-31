package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandshakeFields extends StObject {
  
  var ext: js.Any
}
object HandshakeFields {
  
  @scala.inline
  def apply(ext: js.Any): HandshakeFields = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeFields]
  }
  
  @scala.inline
  implicit class HandshakeFieldsMutableBuilder[Self <: HandshakeFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: js.Any): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
  }
}
