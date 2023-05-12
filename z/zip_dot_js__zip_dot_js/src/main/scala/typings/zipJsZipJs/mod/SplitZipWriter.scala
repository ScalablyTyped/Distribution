package typings.zipJsZipJs.mod

import typings.std.AsyncGenerator
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "SplitZipWriter")
@js.native
open class SplitZipWriter protected () extends SplitDataWriter {
  /**
    * Creates the {@link SplitDataWriter} instance
    *
    * @param writerGenerator A generator of Writer isntances.
    * @param maxSize The maximum size of the data written into {@link Writer} instances (default: 4GB).
    */
  def this(writerGenerator: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any]) = this()
  def this(
    writerGenerator: AsyncGenerator[Writer[Any] | WritableWriter | WritableStream[Any], Boolean, Any],
    maxSize: Double
  ) = this()
}
