package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersSingleByteMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/single-byte", "SingleByteDecoder")
  @js.native
  open class SingleByteDecoder protected ()
    extends typings.zxingTextEncoding.es2015CodersSingleByteSingleByteDecoderMod.SingleByteDecoder {
    def this(index: js.Array[Double], options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/es2015/coders/single-byte", "SingleByteEncoder")
  @js.native
  open class SingleByteEncoder protected ()
    extends typings.zxingTextEncoding.es2015CodersSingleByteSingleByteEncoderMod.SingleByteEncoder {
    def this(index: js.Array[Double | Null], options: Fatal) = this()
  }
}
