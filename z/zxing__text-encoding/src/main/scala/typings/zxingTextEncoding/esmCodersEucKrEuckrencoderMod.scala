package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.esmCommonMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersEucKrEuckrencoderMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/euc-kr/EUCKREncoder", "EUCKREncoder")
  @js.native
  open class EUCKREncoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream Input stream.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double] = js.native
  }
}
