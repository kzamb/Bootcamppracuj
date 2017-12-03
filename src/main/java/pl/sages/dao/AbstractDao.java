package pl.sages.dao;

import pl.sages.model.helpers.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by greg on 03/12/17
 */
public interface AbstractDao<T extends AbstractEntity> extends JpaRepository<T, Long> {
}
