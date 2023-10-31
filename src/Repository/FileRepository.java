package Repository;

import DataAccess.FileDAO;

public class FileRepository implements IFileRepository {

    @Override
    public void countWordInFile() {
        FileDAO.Instance().countWordInFile();
    }

    @Override
    public void findFileNameByWord() {
        FileDAO.Instance().findFileNameByWord();
    }

}
