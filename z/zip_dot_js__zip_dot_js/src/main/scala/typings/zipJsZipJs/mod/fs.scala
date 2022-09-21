package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fs {
  
  @JSImport("@zip.js/zip.js", "fs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The Filesystem constructor.
    * 
    * @defaultValue `FS`
    */
  @JSImport("@zip.js/zip.js", "fs.FS")
  @js.native
  def FS: Instantiable0[FS_] = js.native
  
  /**
    * The Filesystem constructor.
    * 
    * @defaultValue `FS`
    */
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@zip.js/zip.js", "fs.FS")
  @js.native
  open class FSCls () extends FS_
  
  inline def FS_=(x: Instantiable0[FS_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FS")(x.asInstanceOf[js.Any])
  
  /**
    * The `ZipDirectoryEntry` constructor.
    * 
    * @defaultValue `ZipDirectoryEntry`
    */
  @JSImport("@zip.js/zip.js", "fs.ZipDirectoryEntry")
  @js.native
  def ZipDirectoryEntry: Instantiable0[typings.zipJsZipJs.mod.ZipDirectoryEntry] = js.native
  
  /**
    * The `ZipDirectoryEntry` constructor.
    * 
    * @defaultValue `ZipDirectoryEntry`
    */
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@zip.js/zip.js", "fs.ZipDirectoryEntry")
  @js.native
  open class ZipDirectoryEntryCls () extends ZipDirectoryEntry
  
  inline def ZipDirectoryEntry_=(x: Instantiable0[ZipDirectoryEntry]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipDirectoryEntry")(x.asInstanceOf[js.Any])
  
  /**
    * The `ZipFileEntry` constructor.
    * 
    * @defaultValue `ZipFileEntry`
    */
  @JSImport("@zip.js/zip.js", "fs.ZipFileEntry")
  @js.native
  def ZipFileEntry: Instantiable0[typings.zipJsZipJs.mod.ZipFileEntry[js.Object, js.Object]] = js.native
  
  /**
    * The `ZipFileEntry` constructor.
    * 
    * @defaultValue `ZipFileEntry`
    */
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@zip.js/zip.js", "fs.ZipFileEntry")
  @js.native
  open class ZipFileEntryCls[ReaderType, WriterType] () extends ZipFileEntry[ReaderType, WriterType]
  
  inline def ZipFileEntry_=(x: Instantiable0[ZipFileEntry[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFileEntry")(x.asInstanceOf[js.Any])
}
