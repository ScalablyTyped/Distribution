package typings.zipJsZipJs.mod

import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "ZipWriter")
@js.native
open class ZipWriter[Type] protected () extends StObject {
  def this(writer: WritableStream[Any]) = this()
  def this(writer: WritableWriter) = this()
  /**
    * Creates the `ZipWriter` instance
    * 
    * @param writer The `Writer` instance where the zip content will be written.
    * @param options The options.
    */
  def this(writer: Writer[Type]) = this()
  def this(writer: WritableStream[Any], options: ZipWriterConstructorOptions) = this()
  def this(writer: WritableWriter, options: ZipWriterConstructorOptions) = this()
  def this(writer: Writer[Type], options: ZipWriterConstructorOptions) = this()
  
  /**
    * Adds an entry into the zip file
    * 
    * @param filename The filename of the entry.
    * @param reader The `Reader` instance used to read the content of the entry.
    * @param options The options.
    * @returns A promise resolving to an `Entry` instance.
    */
  def add[ReaderType](filename: String): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: Null, options: ZipWriterAddDataOptions): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: Unit, options: ZipWriterAddDataOptions): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: ReadableStream[Any]): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: ReadableStream[Any], options: ZipWriterAddDataOptions): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: ReadableReader): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: ReadableReader, options: ZipWriterAddDataOptions): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: Reader[ReaderType]): js.Promise[Entry] = js.native
  def add[ReaderType](filename: String, reader: Reader[ReaderType], options: ZipWriterAddDataOptions): js.Promise[Entry] = js.native
  
  /**
    * Writes the entries directory, writes the global comment, and returns the content of the zip file
    * 
    * @param comment The global comment of the zip file.
    * @param options The options.
    * @returns The content of the zip file.
    */
  def close(): js.Promise[Type] = js.native
  def close(comment: js.typedarray.Uint8Array): js.Promise[Type] = js.native
  def close(comment: js.typedarray.Uint8Array, options: ZipWriterCloseOptions): js.Promise[Type] = js.native
  def close(comment: Null, options: ZipWriterCloseOptions): js.Promise[Type] = js.native
  def close(comment: Unit, options: ZipWriterCloseOptions): js.Promise[Type] = js.native
  
  /**
    * `true` if the zip contains at least one entry that has been partially written.
    */
  val hasCorruptedEntries: js.UndefOr[Boolean] = js.native
}
