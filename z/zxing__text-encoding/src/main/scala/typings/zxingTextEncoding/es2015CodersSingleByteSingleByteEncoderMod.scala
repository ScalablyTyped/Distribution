package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersSingleByteSingleByteEncoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/single-byte/SingleByteEncoder", "SingleByteEncoder")
  @js.native
  open class SingleByteEncoder protected () extends StObject {
    def this(index: js.Array[Double | Null], options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream Input stream.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double] = js.native
    
    /* private */ var index: Any = js.native
  }
}
