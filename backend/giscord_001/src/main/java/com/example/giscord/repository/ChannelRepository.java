package com.example.giscord.repository;

import com.example.giscord.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ChannelRepository extends JpaRepository<Channel, Long> {

    @Query("select c from Channel c " +
            "left join fetch c.members cm " +
            "left join fetch cm.user u " +
            "where c.channelId = :id")
    Optional<Channel> findByIdWithMembersAndUsers(@Param("id") Long id);

    @Query("select c from Channel c " +
            "left join fetch c.messages m " +
            "left join fetch m.sender s " +
            "where c.channelId = :id")
    Optional<Channel> findByIdWithMessagesAndSenders(@Param("id") Long id);
}

