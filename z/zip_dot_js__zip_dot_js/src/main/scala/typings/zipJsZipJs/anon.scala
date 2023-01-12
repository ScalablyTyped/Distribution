package typings.zipJsZipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deflate extends StObject {
    
    /**
      * The URIs of the scripts implementing used for compression.
      */
    var deflate: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The URIs of the scripts implementing used for decompression.
      */
    var inflate: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Deflate {
    
    inline def apply(): Deflate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deflate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deflate] (val x: Self) extends AnyVal {
      
      inline def setDeflate(value: js.Array[String]): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
      
      inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
      
      inline def setDeflateVarargs(value: String*): Self = StObject.set(x, "deflate", js.Array(value*))
      
      inline def setInflate(value: js.Array[String]): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
      
      inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
      
      inline def setInflateVarargs(value: String*): Self = StObject.set(x, "inflate", js.Array(value*))
    }
  }
}
