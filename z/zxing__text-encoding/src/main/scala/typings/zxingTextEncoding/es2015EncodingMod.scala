package typings.zxingTextEncoding

import typings.zxingTextEncoding.es2015CommonTextDecoderMod.TextDecoderOptions
import typings.zxingTextEncoding.es2015CommonTextEncoderMod.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015EncodingMod {
  
  @JSImport("@zxing/text-encoding/es2015/encoding", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.zxingTextEncoding.es2015CommonTextDecoderMod.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  @JSImport("@zxing/text-encoding/es2015/encoding", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.zxingTextEncoding.es2015CommonTextEncoderMod.TextEncoder {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
  }
}
