package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.Instantiable0
import typings.zipJsZipJs.anon.Deflate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the configuration passed to {@link configure}.
  */
trait Configuration
  extends StObject
     with WorkerConfiguration {
  
  /**
    * The stream implementation used to compress data when `useCompressionStream` is set to `false`.
    * 
    * @defaultValue {@link CodecStream}
    */
  var CompressionStream: js.UndefOr[Instantiable0[GenericTransformStream]] = js.undefined
  
  /**
    * The stream implementation used to decompress data when `useCompressionStream` is set to `false`.
    * 
    * @defaultValue {@link CodecStream}
    */
  var DecompressionStream: js.UndefOr[Instantiable0[GenericTransformStream]] = js.undefined
  
  /**
    * The codec implementation used to compress data.
    * 
    * @defaultValue {@link ZipDeflate}
    */
  var Deflate: js.UndefOr[Instantiable0[ZipDeflate]] = js.undefined
  
  /**
    * The codec implementation used to decompress data.
    * 
    * @defaultValue {@link ZipInflate}
    */
  var Inflate: js.UndefOr[Instantiable0[ZipInflate]] = js.undefined
  
  /**
    * The size of the chunks in bytes during data compression/decompression.
    * 
    * @defaultValue 524288
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of web workers used to compress/decompress data simultaneously.
    * 
    * @defaultValue `navigator.hardwareConcurrency`
    */
  var maxWorkers: js.UndefOr[Double] = js.undefined
  
  /**
    * The delay in milliseconds before idle web workers are automatically terminated. You can call `terminateWorkers()` to terminate idle workers.
    * 
    * @defaultValue 5000
    */
  var terminateWorkerTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The URIs of the compression/decompression scripts run in web workers.
    * 
    * It allows using alternative deflate implementations or specifying a URL to the worker script if the CSP of the page blocks scripts imported from a Blob URI.
    * The properties `deflate` and `inflate` must specify arrays of URLs to import the deflate/inflate web workers, respectively.
    * The first URL is relative to the base URI of the document. The other URLs are relative to the URL of the first script. Scripts in the array are executed in order.
    * If you only use deflation or inflation, the unused `deflate`/`inflate` property can be omitted.
    * 
    * Here is an example: 
    * ```
    * configure({
    *   workerScripts: {
    *     deflate: ["library_path/custom-worker.js", "./custom-deflate.js"],
    *     inflate: ["library_path/custom-worker.js", "./custom-inflate.js"]
    *   }
    * });
    * ```
    * 
    * If the CSP of the page blocks scripts imported from a Blob URI you can use `z-worker.js` from https://github.com/gildas-lormeau/zip.js/tree/master/dist and specify the URL where it can be found.
    * 
    * Here is an example:
    * ```
    * configure({
    *   workerScripts: {
    *     deflate: ["library_path/z-worker.js"],
    *     inflate: ["library_path/z-worker.js"]
    *   }
    * });
    * ```
    */
  var workerScripts: js.UndefOr[Deflate] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setCompressionStream(value: Instantiable0[GenericTransformStream]): Self = StObject.set(x, "CompressionStream", value.asInstanceOf[js.Any])
    
    inline def setCompressionStreamUndefined: Self = StObject.set(x, "CompressionStream", js.undefined)
    
    inline def setDecompressionStream(value: Instantiable0[GenericTransformStream]): Self = StObject.set(x, "DecompressionStream", value.asInstanceOf[js.Any])
    
    inline def setDecompressionStreamUndefined: Self = StObject.set(x, "DecompressionStream", js.undefined)
    
    inline def setDeflate(value: Instantiable0[ZipDeflate]): Self = StObject.set(x, "Deflate", value.asInstanceOf[js.Any])
    
    inline def setDeflateUndefined: Self = StObject.set(x, "Deflate", js.undefined)
    
    inline def setInflate(value: Instantiable0[ZipInflate]): Self = StObject.set(x, "Inflate", value.asInstanceOf[js.Any])
    
    inline def setInflateUndefined: Self = StObject.set(x, "Inflate", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setTerminateWorkerTimeout(value: Double): Self = StObject.set(x, "terminateWorkerTimeout", value.asInstanceOf[js.Any])
    
    inline def setTerminateWorkerTimeoutUndefined: Self = StObject.set(x, "terminateWorkerTimeout", js.undefined)
    
    inline def setWorkerScripts(value: Deflate): Self = StObject.set(x, "workerScripts", value.asInstanceOf[js.Any])
    
    inline def setWorkerScriptsUndefined: Self = StObject.set(x, "workerScripts", js.undefined)
  }
}
