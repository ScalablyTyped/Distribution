package typings.zxingTextEncoding

import typings.zxingTextEncoding.es2015CommonTextDecoderMod.TextDecoderOptions
import typings.zxingTextEncoding.es2015CommonTextEncoderMod.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CommonMod {
  
  @JSImport("@zxing/text-encoding/es2015/common", "Stream")
  @js.native
  open class Stream protected ()
    extends typings.zxingTextEncoding.es2015CommonStreamMod.Stream {
    /**
      *
      * @constructor
      * @param {!(Array.<number>|Uint8Array)} tokens Array of tokens that provide
      * the stream.
      */
    def this(tokens: js.Array[Double]) = this()
    def this(tokens: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("@zxing/text-encoding/es2015/common", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.zxingTextEncoding.es2015CommonTextDecoderMod.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  @JSImport("@zxing/text-encoding/es2015/common", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.zxingTextEncoding.es2015CommonTextEncoderMod.TextEncoder {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
  }
}
