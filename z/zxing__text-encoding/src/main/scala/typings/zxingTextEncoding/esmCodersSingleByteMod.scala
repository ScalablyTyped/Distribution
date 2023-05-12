package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersSingleByteMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/single-byte", "SingleByteDecoder")
  @js.native
  open class SingleByteDecoder protected ()
    extends typings.zxingTextEncoding.esmCodersSingleByteSingleByteDecoderMod.SingleByteDecoder {
    def this(index: js.Array[Double], options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/coders/single-byte", "SingleByteEncoder")
  @js.native
  open class SingleByteEncoder protected ()
    extends typings.zxingTextEncoding.esmCodersSingleByteSingleByteEncoderMod.SingleByteEncoder {
    def this(index: js.Array[Double | Null], options: Fatal) = this()
  }
}
