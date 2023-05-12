package typings.zxingTextEncoding

import typings.zxingTextEncoding.cjsCommonTextDecoderMod.TextDecoderOptions
import typings.zxingTextEncoding.cjsCommonTextEncoderMod.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCommonMod {
  
  @JSImport("@zxing/text-encoding/cjs/common", "Stream")
  @js.native
  open class Stream protected ()
    extends typings.zxingTextEncoding.cjsCommonStreamMod.Stream {
    /**
      *
      * @constructor
      * @param {!(Array.<number>|Uint8Array)} tokens Array of tokens that provide
      * the stream.
      */
    def this(tokens: js.Array[Double]) = this()
    def this(tokens: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("@zxing/text-encoding/cjs/common", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.zxingTextEncoding.cjsCommonTextDecoderMod.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  @JSImport("@zxing/text-encoding/cjs/common", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.zxingTextEncoding.cjsCommonTextEncoderMod.TextEncoder {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
  }
}
