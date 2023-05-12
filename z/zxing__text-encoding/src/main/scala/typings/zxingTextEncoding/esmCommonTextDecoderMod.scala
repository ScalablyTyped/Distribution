package typings.zxingTextEncoding

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCommonTextDecoderMod {
  
  @JSImport("@zxing/text-encoding/esm/common/TextDecoder", "TextDecoder")
  @js.native
  open class TextDecoder () extends StObject {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
    
    /* private */ var _BOMseen: Any = js.native
    
    /* private */ var _decoder: Any = js.native
    
    /* private */ var _do_not_flush: Any = js.native
    
    /* private */ var _encoding: Any = js.native
    
    /* private */ var _error_mode: Any = js.native
    
    /* private */ var _ignoreBOM: Any = js.native
    
    /**
      * @param {BufferSource=} input The buffer of bytes to decode.
      * @param {Object=} options
      * @return {string} The decoded string.
      */
    def decode(): String = js.native
    def decode(input: js.typedarray.ArrayBuffer): String = js.native
    def decode(input: js.typedarray.ArrayBuffer, options: DecodeOptions): String = js.native
    def decode(input: js.typedarray.Uint8Array): String = js.native
    def decode(input: js.typedarray.Uint8Array, options: DecodeOptions): String = js.native
    def decode(input: Unit, options: DecodeOptions): String = js.native
    def decode(input: ArrayLike[Double]): String = js.native
    def decode(input: ArrayLike[Double], options: DecodeOptions): String = js.native
    
    def encoding: String = js.native
    
    def fatal: Boolean = js.native
    
    def ignoreBOM: Boolean = js.native
    
    /**
      * @param {!Array.<number>} stream
      * @return {string}
      * @this {TextDecoder}
      */
    /* private */ var serializeStream: Any = js.native
  }
  
  trait DecodeOptions extends StObject {
    
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    inline def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait TextDecoderOptions extends StObject {
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var ignoreBOM: js.UndefOr[Boolean] = js.undefined
  }
  object TextDecoderOptions {
    
    inline def apply(): TextDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
    }
  }
}
