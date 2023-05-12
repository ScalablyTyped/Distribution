package typings.zxingTextEncoding

import typings.zxingTextEncoding.cjsCommonTextDecoderMod.TextDecoderOptions
import typings.zxingTextEncoding.cjsCommonTextEncoderMod.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsEncodingMod {
  
  @JSImport("@zxing/text-encoding/cjs/encoding", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typings.zxingTextEncoding.cjsCommonTextDecoderMod.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  @JSImport("@zxing/text-encoding/cjs/encoding", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typings.zxingTextEncoding.cjsCommonTextEncoderMod.TextEncoder {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
  }
}
