package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents configuration passed to `configure()`, the constructor of `ZipReader`, `ZipReader#getData()`, the constructor of `ZipWriter`, and `ZipWriter#add()`.
  */
trait WorkerConfiguration extends StObject {
  
  /**
    * `true` to use the API `CompressionStream`/`DecompressionStream` to compress/decompress data.
    * 
    * @defaultValue true
    */
  var useCompressionStream: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to use web workers to compress/decompress data in non-blocking background processes.
    * 
    * @defaultValue true
    */
  var useWebWorkers: js.UndefOr[Boolean] = js.undefined
}
object WorkerConfiguration {
  
  inline def apply(): WorkerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerConfiguration]
  }
  
  extension [Self <: WorkerConfiguration](x: Self) {
    
    inline def setUseCompressionStream(value: Boolean): Self = StObject.set(x, "useCompressionStream", value.asInstanceOf[js.Any])
    
    inline def setUseCompressionStreamUndefined: Self = StObject.set(x, "useCompressionStream", js.undefined)
    
    inline def setUseWebWorkers(value: Boolean): Self = StObject.set(x, "useWebWorkers", value.asInstanceOf[js.Any])
    
    inline def setUseWebWorkersUndefined: Self = StObject.set(x, "useWebWorkers", js.undefined)
  }
}
