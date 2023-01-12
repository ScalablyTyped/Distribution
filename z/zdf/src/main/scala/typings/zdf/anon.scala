package typings.zdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quality extends StObject {
    
    var quality: String
    
    var uri: String
  }
  object Quality {
    
    inline def apply(quality: String, uri: String): Quality = {
      val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quality]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Quality] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
