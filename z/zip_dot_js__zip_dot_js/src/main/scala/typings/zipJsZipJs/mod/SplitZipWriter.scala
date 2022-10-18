package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "SplitZipWriter")
@js.native
open class SplitZipWriter protected ()
  extends StObject
     with Initializable
     with WritableWriter {
  /**
    * Creates the `SplitZipWriter` instance
    * 
    * @param writerGenerator The MIME type of the content.
    * @param maxSize The maximum size of the data written into `Writer` instances (default: 4GB).
    */
  def this(writerGenerator: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]) = this()
  def this(
    writerGenerator: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any],
    maxSize: Double
  ) = this()
  
  /**
    * Initializes the instance asynchronously
    */
  @JSName("init")
  def init_MSplitZipWriter(): js.Promise[Unit] = js.native
  
  /**
    * The `WritableStream` instance.
    */
  /* CompleteClass */
  var writable: WritableStream[Any] = js.native
}
