package typings.zui

import typings.zui.anon.Crop
import typings.zui.anon.Error
import typings.zui.anon.Height
import typings.zui.anon.Id
import typings.zui.anon.Maxfilesize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uploader
  */
trait UploaderOption extends StObject {
  
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  var browseByClickList: js.UndefOr[Boolean] = js.undefined
  
  var browse_button: js.UndefOr[String] = js.undefined
  
  var chunk_size: js.UndefOr[String] = js.undefined
  
  var deleteActionOnDone: js.UndefOr[Boolean] = js.undefined
  
  var deleteConfirm: js.UndefOr[Boolean | String] = js.undefined
  
  var dropPlaceholder: js.UndefOr[Boolean] = js.undefined
  
  var drop_element: js.UndefOr[String] = js.undefined
  
  var fileFormater: js.UndefOr[js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, Unit]] = js.undefined
  
  var fileIconCreator: js.UndefOr[
    js.Function3[/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader, Unit]
  ] = js.undefined
  
  var fileList: js.UndefOr[String] = js.undefined
  
  var fileTemplate: js.UndefOr[String] = js.undefined
  
  var file_data_name: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[Maxfilesize] = js.undefined
  
  var flash_swf_url: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var limitFilesCount: js.UndefOr[Boolean | Double] = js.undefined
  
  var max_retries: js.UndefOr[Double] = js.undefined
  
  var multi_selection: js.UndefOr[Boolean] = js.undefined
  
  var multipart: js.UndefOr[Boolean] = js.undefined
  
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.undefined
  
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  
  var onChunkUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  
  var onFileUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.undefined
  
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], Unit]] = js.undefined
  
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.undefined
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onQueueChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, Unit]] = js.undefined
  
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.undefined
  
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  
  var previewImageIcon: js.UndefOr[Boolean] = js.undefined
  
  var previewImageSize: js.UndefOr[Height] = js.undefined
  
  var qiniu: js.UndefOr[js.Object] = js.undefined
  
  var removeUploaded: js.UndefOr[Boolean] = js.undefined
  
  var rename: js.UndefOr[Boolean] = js.undefined
  
  var renameActionOnDone: js.UndefOr[Boolean] = js.undefined
  
  var renameByClick: js.UndefOr[Boolean] = js.undefined
  
  var renameExtension: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Crop] = js.undefined
  
  var responseHandler: js.UndefOr[Boolean | CallBack] = js.undefined
  
  var runtimes: js.UndefOr[String] = js.undefined
  
  var sendFileId: js.UndefOr[Boolean] = js.undefined
  
  var sendFileName: js.UndefOr[Boolean] = js.undefined
  
  var silverlight_xap_url: js.UndefOr[String] = js.undefined
  
  var staticFiles: js.UndefOr[js.Array[Id]] = js.undefined
  
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, Unit]
  ] = js.undefined
  
  var unique_names: js.UndefOr[Boolean] = js.undefined
  
  var uploadedMessage: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object UploaderOption {
  
  inline def apply(url: String): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderOption]
  }
  
  extension [Self <: UploaderOption](x: Self) {
    
    inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    inline def setBrowseByClickList(value: Boolean): Self = StObject.set(x, "browseByClickList", value.asInstanceOf[js.Any])
    
    inline def setBrowseByClickListUndefined: Self = StObject.set(x, "browseByClickList", js.undefined)
    
    inline def setBrowse_button(value: String): Self = StObject.set(x, "browse_button", value.asInstanceOf[js.Any])
    
    inline def setBrowse_buttonUndefined: Self = StObject.set(x, "browse_button", js.undefined)
    
    inline def setChunk_size(value: String): Self = StObject.set(x, "chunk_size", value.asInstanceOf[js.Any])
    
    inline def setChunk_sizeUndefined: Self = StObject.set(x, "chunk_size", js.undefined)
    
    inline def setDeleteActionOnDone(value: Boolean): Self = StObject.set(x, "deleteActionOnDone", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionOnDoneUndefined: Self = StObject.set(x, "deleteActionOnDone", js.undefined)
    
    inline def setDeleteConfirm(value: Boolean | String): Self = StObject.set(x, "deleteConfirm", value.asInstanceOf[js.Any])
    
    inline def setDeleteConfirmUndefined: Self = StObject.set(x, "deleteConfirm", js.undefined)
    
    inline def setDropPlaceholder(value: Boolean): Self = StObject.set(x, "dropPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setDropPlaceholderUndefined: Self = StObject.set(x, "dropPlaceholder", js.undefined)
    
    inline def setDrop_element(value: String): Self = StObject.set(x, "drop_element", value.asInstanceOf[js.Any])
    
    inline def setDrop_elementUndefined: Self = StObject.set(x, "drop_element", js.undefined)
    
    inline def setFileFormater(value: (/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS) => Unit): Self = StObject.set(x, "fileFormater", js.Any.fromFunction3(value))
    
    inline def setFileFormaterUndefined: Self = StObject.set(x, "fileFormater", js.undefined)
    
    inline def setFileIconCreator(value: (/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader) => Unit): Self = StObject.set(x, "fileIconCreator", js.Any.fromFunction3(value))
    
    inline def setFileIconCreatorUndefined: Self = StObject.set(x, "fileIconCreator", js.undefined)
    
    inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
    
    inline def setFileTemplate(value: String): Self = StObject.set(x, "fileTemplate", value.asInstanceOf[js.Any])
    
    inline def setFileTemplateUndefined: Self = StObject.set(x, "fileTemplate", js.undefined)
    
    inline def setFile_data_name(value: String): Self = StObject.set(x, "file_data_name", value.asInstanceOf[js.Any])
    
    inline def setFile_data_nameUndefined: Self = StObject.set(x, "file_data_name", js.undefined)
    
    inline def setFilters(value: Maxfilesize): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFlash_swf_url(value: String): Self = StObject.set(x, "flash_swf_url", value.asInstanceOf[js.Any])
    
    inline def setFlash_swf_urlUndefined: Self = StObject.set(x, "flash_swf_url", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLimitFilesCount(value: Boolean | Double): Self = StObject.set(x, "limitFilesCount", value.asInstanceOf[js.Any])
    
    inline def setLimitFilesCountUndefined: Self = StObject.set(x, "limitFilesCount", js.undefined)
    
    inline def setMax_retries(value: Double): Self = StObject.set(x, "max_retries", value.asInstanceOf[js.Any])
    
    inline def setMax_retriesUndefined: Self = StObject.set(x, "max_retries", js.undefined)
    
    inline def setMulti_selection(value: Boolean): Self = StObject.set(x, "multi_selection", value.asInstanceOf[js.Any])
    
    inline def setMulti_selectionUndefined: Self = StObject.set(x, "multi_selection", js.undefined)
    
    inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    inline def setMultipart_params(value: js.Object | CallBack): Self = StObject.set(x, "multipart_params", value.asInstanceOf[js.Any])
    
    inline def setMultipart_paramsFunction0(value: () => Unit): Self = StObject.set(x, "multipart_params", js.Any.fromFunction0(value))
    
    inline def setMultipart_paramsUndefined: Self = StObject.set(x, "multipart_params", js.undefined)
    
    inline def setOnBeforeUpload(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction1(value))
    
    inline def setOnBeforeUploadUndefined: Self = StObject.set(x, "onBeforeUpload", js.undefined)
    
    inline def setOnChunkUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = StObject.set(x, "onChunkUploaded", js.Any.fromFunction2(value))
    
    inline def setOnChunkUploadedUndefined: Self = StObject.set(x, "onChunkUploaded", js.undefined)
    
    inline def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFileUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = StObject.set(x, "onFileUploaded", js.Any.fromFunction2(value))
    
    inline def setOnFileUploadedUndefined: Self = StObject.set(x, "onFileUploaded", js.undefined)
    
    inline def setOnFilesAdded(value: /* fiels */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onFilesAdded", js.Any.fromFunction1(value))
    
    inline def setOnFilesAddedUndefined: Self = StObject.set(x, "onFilesAdded", js.undefined)
    
    inline def setOnFilesRemoved(value: /* files */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onFilesRemoved", js.Any.fromFunction1(value))
    
    inline def setOnFilesRemovedUndefined: Self = StObject.set(x, "onFilesRemoved", js.undefined)
    
    inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnQueueChanged(value: () => Unit): Self = StObject.set(x, "onQueueChanged", js.Any.fromFunction0(value))
    
    inline def setOnQueueChangedUndefined: Self = StObject.set(x, "onQueueChanged", js.undefined)
    
    inline def setOnStateChanged(value: /* status */ STATUS => Unit): Self = StObject.set(x, "onStateChanged", js.Any.fromFunction1(value))
    
    inline def setOnStateChangedUndefined: Self = StObject.set(x, "onStateChanged", js.undefined)
    
    inline def setOnUploadComplete(value: /* files */ js.Array[FileObj] => Unit): Self = StObject.set(x, "onUploadComplete", js.Any.fromFunction1(value))
    
    inline def setOnUploadCompleteUndefined: Self = StObject.set(x, "onUploadComplete", js.undefined)
    
    inline def setOnUploadFile(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onUploadFile", js.Any.fromFunction1(value))
    
    inline def setOnUploadFileUndefined: Self = StObject.set(x, "onUploadFile", js.undefined)
    
    inline def setOnUploadProgress(value: /* file */ FileObj => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setPreviewImageIcon(value: Boolean): Self = StObject.set(x, "previewImageIcon", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageIconUndefined: Self = StObject.set(x, "previewImageIcon", js.undefined)
    
    inline def setPreviewImageSize(value: Height): Self = StObject.set(x, "previewImageSize", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageSizeUndefined: Self = StObject.set(x, "previewImageSize", js.undefined)
    
    inline def setQiniu(value: js.Object): Self = StObject.set(x, "qiniu", value.asInstanceOf[js.Any])
    
    inline def setQiniuUndefined: Self = StObject.set(x, "qiniu", js.undefined)
    
    inline def setRemoveUploaded(value: Boolean): Self = StObject.set(x, "removeUploaded", value.asInstanceOf[js.Any])
    
    inline def setRemoveUploadedUndefined: Self = StObject.set(x, "removeUploaded", js.undefined)
    
    inline def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameActionOnDone(value: Boolean): Self = StObject.set(x, "renameActionOnDone", value.asInstanceOf[js.Any])
    
    inline def setRenameActionOnDoneUndefined: Self = StObject.set(x, "renameActionOnDone", js.undefined)
    
    inline def setRenameByClick(value: Boolean): Self = StObject.set(x, "renameByClick", value.asInstanceOf[js.Any])
    
    inline def setRenameByClickUndefined: Self = StObject.set(x, "renameByClick", js.undefined)
    
    inline def setRenameExtension(value: Boolean): Self = StObject.set(x, "renameExtension", value.asInstanceOf[js.Any])
    
    inline def setRenameExtensionUndefined: Self = StObject.set(x, "renameExtension", js.undefined)
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setResize(value: Crop): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResponseHandler(value: Boolean | CallBack): Self = StObject.set(x, "responseHandler", value.asInstanceOf[js.Any])
    
    inline def setResponseHandlerFunction0(value: () => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction0(value))
    
    inline def setResponseHandlerUndefined: Self = StObject.set(x, "responseHandler", js.undefined)
    
    inline def setRuntimes(value: String): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setSendFileId(value: Boolean): Self = StObject.set(x, "sendFileId", value.asInstanceOf[js.Any])
    
    inline def setSendFileIdUndefined: Self = StObject.set(x, "sendFileId", js.undefined)
    
    inline def setSendFileName(value: Boolean): Self = StObject.set(x, "sendFileName", value.asInstanceOf[js.Any])
    
    inline def setSendFileNameUndefined: Self = StObject.set(x, "sendFileName", js.undefined)
    
    inline def setSilverlight_xap_url(value: String): Self = StObject.set(x, "silverlight_xap_url", value.asInstanceOf[js.Any])
    
    inline def setSilverlight_xap_urlUndefined: Self = StObject.set(x, "silverlight_xap_url", js.undefined)
    
    inline def setStaticFiles(value: js.Array[Id]): Self = StObject.set(x, "staticFiles", value.asInstanceOf[js.Any])
    
    inline def setStaticFilesUndefined: Self = StObject.set(x, "staticFiles", js.undefined)
    
    inline def setStaticFilesVarargs(value: Id*): Self = StObject.set(x, "staticFiles", js.Array(value :_*))
    
    inline def setStatusCreator(value: (/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader) => Unit): Self = StObject.set(x, "statusCreator", js.Any.fromFunction3(value))
    
    inline def setStatusCreatorUndefined: Self = StObject.set(x, "statusCreator", js.undefined)
    
    inline def setUnique_names(value: Boolean): Self = StObject.set(x, "unique_names", value.asInstanceOf[js.Any])
    
    inline def setUnique_namesUndefined: Self = StObject.set(x, "unique_names", js.undefined)
    
    inline def setUploadedMessage(value: Boolean): Self = StObject.set(x, "uploadedMessage", value.asInstanceOf[js.Any])
    
    inline def setUploadedMessageUndefined: Self = StObject.set(x, "uploadedMessage", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
