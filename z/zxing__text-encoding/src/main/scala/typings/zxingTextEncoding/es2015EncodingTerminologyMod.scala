package typings.zxingTextEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015EncodingTerminologyMod {
  
  @JSImport("@zxing/text-encoding/es2015/encoding/terminology", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@zxing/text-encoding/es2015/encoding/terminology", "end_of_stream")
  @js.native
  val endOfStream: /* -1 */ Double = js.native
  
  inline def isASCIIByte(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isASCIIByte")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@zxing/text-encoding/es2015/encoding/terminology", "isASCIICodePoint")
  @js.native
  val isASCIICodePoint: js.Function1[/* a */ Double, Boolean] = js.native
}
