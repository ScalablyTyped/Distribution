package typings.zxingTextEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCommonTextEncoderMod {
  
  @JSImport("@zxing/text-encoding/esm/common/TextEncoder", "TextEncoder")
  @js.native
  open class TextEncoder () extends StObject {
    def this(label: String) = this()
    def this(label: String, options: TextEncoderOptions) = this()
    def this(label: Unit, options: TextEncoderOptions) = this()
    
    /* private */ var _do_not_flush: Any = js.native
    
    /* private */ var _encoder: Any = js.native
    
    /* private */ var _encoding: Any = js.native
    
    /* private */ var _fatal: Any = js.native
    
    /**
      * @param {string=} opt_string The string to encode.
      * @param {Object=} options
      * @return {!Uint8Array} Encoded bytes, as a Uint8Array.
      */
    def encode(opt_string: String): js.typedarray.Uint8Array = js.native
    def encode(opt_string: String, options: EncodeOptions): js.typedarray.Uint8Array = js.native
    
    def encoding: String = js.native
  }
  
  trait EncodeOptions extends StObject {
    
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait TextEncoderOptions extends StObject {
    
    var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.undefined
    
    var fatal: js.UndefOr[Boolean] = js.undefined
  }
  object TextEncoderOptions {
    
    inline def apply(): TextEncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEncoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", value.asInstanceOf[js.Any])
      
      inline def setNONSTANDARD_allowLegacyEncodingUndefined: Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", js.undefined)
    }
  }
}
