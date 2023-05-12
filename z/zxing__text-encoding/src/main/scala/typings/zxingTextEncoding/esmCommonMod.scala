package typings.zxingTextEncoding

import typings.zxingTextEncoding.esmCommonTextDecoderMod.TextDecoderOptions
import typings.zxingTextEncoding.esmCommonTextEncoderMod.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCommonMod {
  
  @JSImport("@zxing/text-encoding/esm/common", "Stream")
  @js.native
  open class Stream protected ()
    extends typings.zxingTextEncoding.esmCommonStreamMod.Stream {
    /**
      *
      * @constructor
      * @param {!(Array.<number>|Uint8Array)} tokens Array of tokens that provide
      * the stream.
      */
    def this(tokens: js.Array[Double]) = this()
    def this(tokens: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/common", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.zxingTextEncoding.esmCommonTextDecoderMod.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/common", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.zxingTextEncoding.esmCommonTextEncoderMod.TextEncoder {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
  }
}
