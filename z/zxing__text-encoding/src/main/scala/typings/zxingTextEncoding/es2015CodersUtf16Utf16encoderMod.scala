package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersUtf16Utf16encoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/utf-16/UTF16Encoder", "UTF16Encoder")
  @js.native
  open class UTF16Encoder protected () extends StObject {
    def this(utf16_be: Boolean, options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream Input stream.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double] = js.native
    
    /* private */ var utf16_be: Any = js.native
  }
}
