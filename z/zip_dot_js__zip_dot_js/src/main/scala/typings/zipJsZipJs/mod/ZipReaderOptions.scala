package typings.zipJsZipJs.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to the constructor of {@link ZipReader} and {@link Entry#getData}.
  */
trait ZipReaderOptions extends StObject {
  
  /**
    * `true` to check the signature of the entry.
    *
    * @defaultValue false
    */
  var checkSignature: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The password used to decrypt the content of the entry.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * `true` to prevent closing of {@link Writer#writable} when calling {@link Entry#getData}.
    *
    * @defaultValue false
    */
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `AbortSignal` instance used to cancel the decompression.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * `true` to transfer streams to web workers when decompressing data.
    *
    * @defaultValue true
    */
  var transferStreams: js.UndefOr[Boolean] = js.undefined
}
object ZipReaderOptions {
  
  inline def apply(): ZipReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipReaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipReaderOptions] (val x: Self) extends AnyVal {
    
    inline def setCheckSignature(value: Boolean): Self = StObject.set(x, "checkSignature", value.asInstanceOf[js.Any])
    
    inline def setCheckSignatureUndefined: Self = StObject.set(x, "checkSignature", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTransferStreams(value: Boolean): Self = StObject.set(x, "transferStreams", value.asInstanceOf[js.Any])
    
    inline def setTransferStreamsUndefined: Self = StObject.set(x, "transferStreams", js.undefined)
  }
}
