ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
NodeLink requestCommentRangeStartNode = new NodeLink();
requestCommentRangeStartNode.setNodeId("0.3.0");

DocumentPosition requestCommentRangeStart = new DocumentPosition();
requestCommentRangeStart.setNode(requestCommentRangeStartNode);
requestCommentRangeStart.setOffset(0);

NodeLink requestCommentRangeEndNode = new NodeLink();
requestCommentRangeEndNode.setNodeId("0.3.0");

DocumentPosition requestCommentRangeEnd = new DocumentPosition();
requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
requestCommentRangeEnd.setOffset(0);

CommentUpdate requestComment = new CommentUpdate();
requestComment.setRangeStart(requestCommentRangeStart);
requestComment.setRangeEnd(requestCommentRangeEnd);
requestComment.setInitial("IA");
requestComment.setAuthor("Imran Anwar");
requestComment.setText("A new Comment");

UpdateCommentRequest updateRequest = new UpdateCommentRequest("Sample.docx", 0, requestComment, null, null, null, null, null, null, null);
wordsApi.updateComment(updateRequest);