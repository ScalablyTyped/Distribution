package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersGb18030Gb18030encoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/gb18030/GB18030Encoder", "GB18030Encoder")
  @js.native
  open class GB18030Encoder protected () extends StObject {
    def this(options: Fatal) = this()
    def this(options: Fatal, gbk_flag: Boolean) = this()
    
    val fatal: Boolean = js.native
    
    /* private */ var gbk_flag: Any = js.native
    
    /**
      * @param {Stream} stream Input stream.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double] = js.native
  }
}
