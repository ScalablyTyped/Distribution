package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.esmCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersShiftJisShiftJISEncoderMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/shift-jis/ShiftJISEncoder", "ShiftJISEncoder")
  @js.native
  open class ShiftJISEncoder protected () extends StObject {
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
