package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCodersSingleByteMod {
  
  @JSImport("@zxing/text-encoding/cjs/coders/single-byte", "SingleByteDecoder")
  @js.native
  open class SingleByteDecoder protected ()
    extends typings.zxingTextEncoding.cjsCodersSingleByteSingleByteDecoderMod.SingleByteDecoder {
    def this(index: js.Array[Double], options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/cjs/coders/single-byte", "SingleByteEncoder")
  @js.native
  open class SingleByteEncoder protected ()
    extends typings.zxingTextEncoding.cjsCodersSingleByteSingleByteEncoderMod.SingleByteEncoder {
    def this(index: js.Array[Double | Null], options: Fatal) = this()
  }
}
